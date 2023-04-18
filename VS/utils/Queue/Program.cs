using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MOE {
	public class Program {
		public static void Main(string[] args) {
			
		}


		private static int HowManyItems(MOE.Queue<int> queue) {
			int count = 0;

			while (!queue.IsEmpty()) {
				queue.Remove();
				count++;
			}

			return count;
		}
	}
}
