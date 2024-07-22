import React, { useState } from "react";
import Style from "./Userform.module.css";

const UserForm = (props) => {
  const initValues = {
    firstname: "",
    lastname: "",
    email: "",
    password: "",
    confirmpassword: "",
  };
  const initError = {
    firstname: "",
    lastname: "",
    email: "",
    password: "",
    confirmpassword: "",
  };
  const [user, setUser] = useState(initValues);
  const [error, setError] = useState(initError);

  const handleChange = (e) => {
    const { name, value } = e.target;
    let errorMessage = "";

    switch (name) {
      case "firstname":
        errorMessage =
          value.length < 2 ? "first Name must be at least 2 characters!" : "";
        break;
      case "lastname":
        errorMessage =
          value.length < 2 ? "first Name must be at least 2 characters!" : "";
        break;
      case "email":
        errorMessage =
          value.length < 2 ? "first Name must be at least 2 characters!" : "";
        break;
      case "password":
        errorMessage =
          value.length < 8 ? "first Name must be at least 8 characters!" : "";
        break;
      case "confirmpassword":
        errorMessage = value !== user.password ? "Password must match!" : "";
        break;
      default:
        break;
    }

    setError({ ...error, [name]: errorMessage });
    setUser({ ...user, [name]: value });
  };

  return (
    <>
      <pre>Error : {JSON.stringify(error)}</pre>
      <pre>User : {JSON.stringify(user)}</pre>

      <form onSubmit={(e) => e.preventDefault()}>
        <div className={Style.formControl}>
          <label>First Name: </label>
          <input
            type="text"
            name="firstname"
            value={user.firstname}
            onChange={handleChange}
          />
          {error.firstname && (
            <div className={Style.error}>{error.firstname}</div>
          )}
        </div>

        <div className={Style.formControl}>
          <label>Last Name: </label>
          <input
            type="text"
            value={user.lastname}
            name="lastname"
            onChange={handleChange}
          />
          {error.lastname && (
            <div className={Style.error}>{error.lastname}</div>
          )}
        </div>
        <div className={Style.formControl}>
          <label>email: </label>
          <input
            type="text"
            value={user.email}
            name="email"
            onChange={handleChange}
          />
          {error.email && <div className={Style.error}>{error.email}</div>}
        </div>
        <div className={Style.formControl}>
          <label>password: </label>
          <input
            type="password"
            name="password"
            value={user.password}
            onChange={handleChange}
          />
          {error.password && (
            <div className={Style.error}>{error.password}</div>
          )}
        </div>
        <div className={Style.formControl}>
          <label>confirm password: </label>
          <input
            type="password"
            name="confirmpassword"
            value={user.confirmpassword}
            onChange={handleChange}
          />
          {error.confirmpassword && (
            <div className={Style.error}>{error.confirmpassword}</div>
          )}
        </div>
      </form>
      <div className={Style.display}>
        <p>
          <b>First Name : </b>
          {user.firstname}
        </p>
        <br />
        <p>
          <b>Last Name : </b>
          {user.lastname}
        </p>{" "}
        <br />
        <p>
          <b>email : </b>
          {user.email}
        </p>{" "}
        <br />
        <p>
          <b>Password : </b>
          {user.password}
        </p>{" "}
        <br />
        <p>
          <b>Confirm Password : </b>
          {user.confirmpassword}
        </p>{" "}
        <br />
      </div>
    </>
  );
};

export default UserForm;
