// src/hooks/useFetch.ts

import { useEffect, useState } from 'react';

export default function useFetch(url: string) {
  const [data, setData] = useState([]);
  const [error, setError] = useState(null);
  const [loading, setLoading] = useState(true);

  const refresh = () => {
    setLoading(true);
    fetch(url)
      .then((result) => result.json())
      .then((dataFetch) => setData(dataFetch.results))
      .catch((err) => setError(err))
      .finally(() => setLoading(false));
  };

  useEffect(() => {
    refresh();
  }, []);

  return { loading, error, data, refresh };
}
