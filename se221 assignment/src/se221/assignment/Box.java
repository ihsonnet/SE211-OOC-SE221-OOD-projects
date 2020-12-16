package se221.assignment;

    class Box {
        double width;
        double height;
        double depth;

        Box(Box ob){  // pass object to constructor
            width = ob.width;
            height = ob.height;
            depth = ob.depth;
        }

        Box(double w, double h, double d){
            width = w;
            height = h;
            depth = d;
        }

        Box(){
            width = -1;
            height = -1;
            depth = -1;
        }
        Box(double len){
            width = height = depth = len;
        }

        double volume(){
            return width * height * depth;
        }
}
