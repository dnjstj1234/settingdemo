import logo from './logo.svg';
import './App.css';
import { useEffect, useState }  from "react"

function App() {

  const [data, setData] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/getData", { method: "GET" })
        .then((res) => {
          return res.json();
        })
        .then(function (result) {
          setData(result);
        })
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <ul>
            {data.map((v)=><li>작성자 : {v.name} // 제목: {v.title}</li>)}
        </ul>
      </header>
    </div>
  );
}

export default App;
