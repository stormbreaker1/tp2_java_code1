package abcd;

// In this enum we will try creating methods as enum objects...............


public enum Enum_tom4
{
	 NORTH {
	        @Override
	        public Enum_tom4 getOppositeDirection() {
	            return SOUTH;
	        }
	    }, 
	    SOUTH {
	        @Override
	        public Enum_tom4 getOppositeDirection() {
	            return NORTH;
	        }
	    },
	    EAST {
	        @Override
	        public Enum_tom4 getOppositeDirection() {
	            return WEST;
	        }
	    },
	    WEST {
	        @Override
	        public Enum_tom4 getOppositeDirection() {
	            return EAST;
	        }
	    };


	    public abstract Enum_tom4 getOppositeDirection();
}


// This below code is giving error, it's not working..........
//public class Enum_tom4 {
//	enum methods
//	{
//		MELIODAS(
//				public methods saying()
//				{
//					System.out.println("Hello! I am Meliodas");
//				}
//				),
//		ELIZABETH(
//				public methods saying()
//				{
//					System.out.println("Hello! I am Elizabeth");
//				}
//						);
//	}
//}
