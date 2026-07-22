import './App.css';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {

  let flag = true;

  if (flag === true) {
    return (
      <div className="App">
        <ListofPlayers />
      </div>
    );
  } else {
    return (
      <div className="App">
        <IndianPlayers />
      </div>
    );
  }
}

export default App;