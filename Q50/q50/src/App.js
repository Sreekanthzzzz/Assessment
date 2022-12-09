import logo from './logo.svg';
import './App.css';
import { connect } from 'react-redux';
import { Random } from './actions';


function App({local_variable,Random}) {
  return (
    <div className="App">
      <h1>{local_variable}</h1>
      <button onClick={Random}>Magic Number</button>
      
    </div>
  );
}
const mapStateToProps =state =>({
  local_variable : state
})
export default connect(mapStateToProps,{Random}) (App);
