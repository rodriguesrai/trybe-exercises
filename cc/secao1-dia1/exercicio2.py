def average(list):
  result = 0
  totalNumbers = 0
  for element in list:
        result += element
        totalNumbers += 1
  average = result / totalNumbers
  return average

print(average([1,2,3,4,5]))
