 var number = 1;
      let count = 2;          //Included in JS (ECMSjs5 and ES6)
                            //let does not allow access of variable outside scope

    function doSomething(){
        for (var i = 0; i < 5; i++){        //var is available outside scope of for block
            console.log(i);                 //change var to let
        }
        console.log('Finally ' + i);
    }

    doSomething();
