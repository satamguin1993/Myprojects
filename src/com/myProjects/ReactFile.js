class parent {

    constructor() {
        this.state = {
            buttonClicked = false;
        }
    }

    this.doSomething() {

        this.setState(buttonClick : true);

    }

    render() = {

        <Button onClick={this.doSomething} />

        return (

            <div>
                { this.state.buttonClick ?
                <div>
                    <Child1 message={'send this message to child 1'}/>
                    <Child2 message={'send this message to child 2'}/>
                </div> : <div>
                }
            </div>

        )
    }

}

const Child1 = (props) = {

   return (
    <div>
        <>
    </div>
   )
}