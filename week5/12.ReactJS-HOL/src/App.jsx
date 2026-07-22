import { useState } from "react";

import Greeting from "./components/Greeting";
import LoginButton from "./components/LoginButton";
import LogoutButton from "./components/LogoutButton";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  let button;

  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogout} />;
  } else {
    button = <LoginButton onClick={handleLogin} />;
  }

  return (

    <div style={{ padding: "30px" }}>

      <h1>Ticket Booking Application</h1>

      <Greeting isLoggedIn={isLoggedIn} />

      <br />

      {button}

    </div>

  );
}

export default App;