import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component {

  constructor(props) {
      super(props);
      this.state = {
          userList: [],
      };
  }

  componentDidMount() {
      fetch('https://lit-hamlet-86251.herokuapp.com/usuarios')
          .then(response => response.json())
          .then(data => {
              let usersList = [];
              data.forEach(function(user) {
                usersList.push(user)
              });
              this.setState({userList: usersList});
          });
  }

  render() {
      return (
        <div>
          <h1>Lista de Usuarios</h1>
          {this.state.userList.map((data, i) => {
            return (
              <div>
                <h3>Usuario: {data.Id}
                
                  {data.nombre}
            
                  {data.correo}
                </h3>
              </div>
            )
          })}
        </div>
      );
  }
}

export default App;
