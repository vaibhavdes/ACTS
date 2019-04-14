

    let log = function(message){
        console.log(message);                                  //Function Declaration
    }

    let doLog = (message) => {                                //Parameters
        console.log(message);                                //Using Arrow Pointer (For Multiple Statements)
    }

    let doLogSmall = (message) => console.log(message);         //(For Single Statement)
                    //Lambda Expression in C#

    
    //  Type Assertions (Ready-Made Operations that can be performed on Data of Particular Type)
    //  Does Not Suggest Operations on Type:any
    //  Do not change Type of Variable at run time (Do not restructure Obj in Memory)
    
    

    let message;
    message = 'abc';
    //  let end =   message.endsWith('c');
    let end = (<string>message).endsWith('c');
    //  let end = (message as string).endsWith('c');

    /*
    let message = 'sbc';
    message.endsWith('c');      //Will return Boolean
    */
