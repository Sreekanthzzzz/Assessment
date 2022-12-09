const count=0;

export default function reducer(state = count,action){

    const {type,payload} =action;
    switch(type){
        case "Random":
            let x = Math.floor((Math.random() * 10000) + 1);
            return x;
        default:
            return state;
    }

}