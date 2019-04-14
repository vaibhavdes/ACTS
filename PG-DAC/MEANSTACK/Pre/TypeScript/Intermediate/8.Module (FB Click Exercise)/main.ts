        //  Module - Exercice (Facebook Click)
        
        Object.defineProperty(exports, "__esModule", { value: true });
        var fbclick_1 = require("./fbclick");
        var fun = new fbclick_1.FBLike(10, true);
        fun.onClick();
        console.log("Count: " + fun.likesCount + ", isSelected: " + fun.isSelected);
