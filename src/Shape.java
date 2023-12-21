import java.util.ArrayList;

public class Shape {
    public ArrayList<Point> points_coll ;
    private int length;

    public Shape() {
        points_coll = new ArrayList<>();
    }

    public void addPoint(Point temp_point){
        points_coll.add(temp_point);
        length++;
    }


    public double calculatePerimeter(){
        double res;
        res = points_coll.getFirst().getDistance(points_coll.get(length-1));
        Point temp2 = points_coll.getFirst();
        for(int i=1;i<length;i++){
            res+=temp2.getDistance(points_coll.get(i));
        }


        return res;
    }
    public double getLongest(){
        double result = 0;
        Point temp2 =points_coll.getFirst();
        for(int i=1;i<length;i++){
            result =Math.max(result,temp2.getDistance(points_coll.get(i)));
        }

        return result;
    }
    public double getAverageSide(){
        return  calculatePerimeter() / length;
    }



}
