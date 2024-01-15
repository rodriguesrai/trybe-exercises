"use strict";
// tests/mocks/login.mock.ts
Object.defineProperty(exports, "__esModule", { value: true });
var validPassword = 'ch4ng3m3';
var noEmailLoginBody = { email: '', password: validPassword };
var validEmail = 'user1@email.com';
var noPasswordLoginBody = { email: validEmail, password: '' };
var notExistingUserBody = { email: 'notfound@email.com', password: validPassword };
var existingUserWithWrongPasswordBody = { email: validEmail, password: 'wrong_password' };
var existingUser = {
    id: 1,
    email: validEmail,
    password: validPassword,
    name: 'user1'
};
var validLoginBody = { email: validEmail, password: validPassword };
exports.default = {
    noEmailLoginBody: noEmailLoginBody,
    noPasswordLoginBody: noPasswordLoginBody,
    notExistingUserBody: notExistingUserBody,
    existingUserWithWrongPasswordBody: existingUserWithWrongPasswordBody,
    existingUser: existingUser,
    validLoginBody: validLoginBody,
};
