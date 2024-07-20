import React, { useState } from "react";
import Style from "./Userform.module.css";

const UserForm = (props) => {
  const [user, setFirstname] = useState({
    firstname: "",
    lastname: "",
    email: "",
    password: "",
    confirmpassword: "",
  });

  return (
    <>
      <form>
        <div>
          <div className={Style.formControl}>
            <label>First Name: </label>
            <input
              type="text"
              value={user.firstname}
              onChange={(e) =>
                setFirstname({ ...user, firstname: e.target.value })
              }
            />
          </div>
          <div className={Style.formControl}>
            <label>Last Name: </label>
            <input
              type="text"
              value={user.lastname}
              onChange={(e) =>
                setFirstname({ ...user, lastname: e.target.value })
              }
            />
          </div>
          <div className={Style.formControl}>
            <label>email: </label>
            <input
              type="text"
              value={user.email}
              onChange={(e) => setFirstname({ ...user, email: e.target.value })}
            />
          </div>
          <div className={Style.formControl}>
            <label>password: </label>
            <input
              type="password"
              value={user.password}
              onChange={(e) =>
                setFirstname({ ...user, password: e.target.value })
              }
            />
          </div>
          <div className={Style.formControl}>
            {" "}
            <label>confirm password: </label>
            <input
              type="password"
              value={user.confirmpassword}
              onChange={(e) =>
                setFirstname({ ...user, confirmpassword: e.target.value })
              }
            />
          </div>
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
