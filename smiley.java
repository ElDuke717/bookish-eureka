import com.educative.graphics.*;

class Smiley {
  public static void main(String[] args) {
    Canvas c;
    c = new Canvas(200, 200);

    // Draw the outline of the face
    c.fill("yellow");
    c.stroke("black");
    c.circle(100, 100, 50);

    // draw the mouth
    c.fill("yellow");
    c.stroke("black");
    c.circle(100, 100, 30);
    
    // cover the mouth
    c.stroke("pink");
    c.fill("orange");
    c.rect(68, 75, 70, 35);


    // draw the eyes
    //left eye
    c.fill("black");
    c.stroke("black");
    c.circle(80, 90, 5);
    
    //right eye
    c.fill("black");
    c.stroke("black");
    c.circle(120, 90, 5);
  }
}