
class Vect3(var x: Double, val,r y: Double, var z: Double) {
	def + (v: Vect3) = new Vect3(x + v.x, y + v.y, z + v.z)
	def - (v: Vect3) = new Vect3(x - v.x, y - v.y, z - v.z)
	def dot(v: Vect3) = x * v.x + y * v.y + z * v.z
	def cross(v: Vect3) = new Vect3(
        y * v.z - z * v.y,
        z * v.z - x * v.z,
        x * v.y - y * v.x  
		)
	def unary_- = new Vect3(-x, -y, -z)
	def apply (index: Int) = index match {
		case 0 => x
		case 1 => y
		case 2 => z
	}
	def update(index: Int, value: Double) {
		index match {
			case 0 => x = value
			case 1 => y = value
			case 2 => z = value
		}
	}
	def printForm: String = "(" + x + ", " + y + ", " + z + ")"
}