// src/models/user.model.js

const UserModel = (sequelize, DataTypes) => {
  const User = sequelize.define('User', {
    fullName: DataTypes.STRING,
    email: DataTypes.STRING,
  });
  (async () => {
    await sequelize.sync({ force: true });
    const jane = await User.create({
      fullName: "Jane Doe",
      email: "jane.doe@trybe.com",
      phoneNum: DataTypes.STRING,
      });
      
      jane.email = "ada.doe@trybe.com";
      await jane.update({ fullName: "Ada Joe" });
      
      // O banco de dados agora tem "Ada Joe" para o nome, mas o email ainda é "jane.doe@trybe.com".
      
      await jane.save();
      // O banco de dados agora tem "ada.doe@trybe.com" para o email.
})();
  return User;
};

module.exports = UserModel;