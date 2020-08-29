
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  int x = 450;
  int y = 450;
  for(int i = 0; i < 8; i++) {
  ellipse(250,250,x,y);
  x=x-50;
  y=y-50;
  }
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
