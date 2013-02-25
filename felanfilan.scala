
class Vect3(val x: Double, val y: Double, val z: Double) {
	def + (v: Vect3) = new Vect3(x + v.x, y + v.y, z + v.z)
	def - (v: Vect3) = new Vect3(x - v.x, y - v.y, z - v.z)
	def dot(v: Vect3) = x * v.x + y * v.y + z * v.z
	def cross(v: Vect3) = new Vect3(
        y * v.z - z * v.y,
        z * v.z - x * v.z,
        x * v.y - y * v.x  
		)
	def unary_- = new Vect3(-x, -y, -z)
	def printForm: String = "(" + x + ", " + y + ", " + z + ")"
}