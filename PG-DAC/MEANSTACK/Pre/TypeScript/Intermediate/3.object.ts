//  Class Object

    class Point {
        x: number;           //Fields for storing data
        y: number;

        draw (){            //can access class variables
            console.log('X: ' + this.x + ', Y: ' + this.y)
        }
        getDistance(another: Point){
            //stmts
        }
    }

    //Object is instance of Class
    
    let point = new Point;          //Allocate Memory with new otherwise error
     point.x = 1;
     point.y = 2;
     point.draw();
