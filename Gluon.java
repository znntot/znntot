public class Gluon {
		public String bindingKey;

		public Gluon(String bindingKey) {
			this.bindingKey = bindingKey;
		}

		public String bind(BitQuark q1, BitQuark q2) {
			return q1.bit + "-" + q2.bit + "-" + bindingKey + ":" + q1.color + q2.color;
		}
	}