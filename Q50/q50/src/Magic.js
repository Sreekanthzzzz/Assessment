import { connect } from 'react-redux';
import { IncAction } from './actions';
import { DecAction } from './actions';

function Magic({local_variable,IncAction,DecAction}) {
  return (
    <div >
      <h1>{local_variable}</h1>
      <button onClick={IncAction}>Increment</button>
      <button onClick={DecAction}>Decrement</button>
    </div>
  );
}
const mapStateToProps =state =>({
  local_variable : state
})
export default connect(mapStateToProps,{IncAction,DecAction}) (Magic);
