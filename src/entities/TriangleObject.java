package entities;

public class TriangleObject {
double firstside;
double secondside;
double thirdside;


public TriangleObject() {}


public TriangleObject(double firstside, double secondside, double thirdside) {
	super();
	this.firstside = firstside;
	this.secondside = secondside;
	this.thirdside = thirdside;
}


public double getFirstside() {
	return firstside;
}


public void setFirstside(double firstside) {
	this.firstside = firstside;
}


public double getSecondside() {
	return secondside;
}


public void setSecondside(double secondside) {
	this.secondside = secondside;
}


public double getThirdside() {
	return thirdside;
}


public void setThirdside(double thirdside) {
	this.thirdside = thirdside;
}



public double calculateArea() {
	double triangleSemPerim = (firstside + secondside + thirdside)/2;
	return Math.sqrt(triangleSemPerim*(triangleSemPerim - getFirstside())* (triangleSemPerim-getSecondside()) * (triangleSemPerim-getThirdside()));
 
}



public String biggerTriangle(double triangleArea1, double triangleArea2) {
    if (triangleArea1 > triangleArea2) {
        return String.format("The first Triangle with %.2f area is bigger than the second triangle with only %.2f area", triangleArea1, triangleArea2);
    } else {
        return String.format("The second Triangle with %.2f area is bigger than the first triangle with only %.2f area", triangleArea2, triangleArea1);
    }
}


}
