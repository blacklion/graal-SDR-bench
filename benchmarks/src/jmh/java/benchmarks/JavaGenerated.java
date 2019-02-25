/*****************************************************************************
 * Copyright (c) 2014, Lev Serebryakov <lev@serebryakov.spb.ru>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 * IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ****************************************************************************/

package benchmarks;

import org.openjdk.jmh.annotations.*;

/**
 * @author Lev Serebryakov
 */
@Fork(2)
@Warmup(iterations = 5, time = 5)
@Measurement(iterations = 10, time = 5)
@State(Scope.Thread)
public class JavaGenerated {
	private final static int BUFSIZE = 44100;
	double data[] = new double[BUFSIZE];
	double out[] = new double[BUFSIZE];

	private static class FIR5_0 extends FIRCompiled_RRR {
		public FIR5_0(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++]; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io] * -0.151365345728131;

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR5_1 extends FIRCompiled_RRR {
		public FIR5_1(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 4 < in_length) {
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.257518107400242;
					a += in[io++];
					a += in[io++] * 0.257518107400242;
					a += in[io] * -0.151365345728131;
				} else {
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io] * -0.151365345728131;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR5_2 extends FIRCompiled_RRR {
		public FIR5_2(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 4 < in_length) {
					a += -0.151365345728131 * (in[io + 0] + in[io + 4]);
					a += 0.257518107400242 * (in[io + 1] + in[io + 3]);
					a += in[io + 2];
				} else {
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io] * -0.151365345728131;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR11_0 extends FIRCompiled_RRR {
		public FIR11_0(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++]; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io] * -0.0636619772367581;

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR11_1 extends FIRCompiled_RRR {
		public FIR11_1(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 10 < in_length) {
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.257518107400242;
					a += in[io++];
					a += in[io++] * 0.257518107400242;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * 0.046774464189432;
					a += in[io] * -0.0636619772367581;
				} else {
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io] * -0.0636619772367581;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR11_2 extends FIRCompiled_RRR {
		public FIR11_2(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 10 < in_length) {
					a += -0.0636619772367581 * (in[io + 0] + in[io + 10]);
					a += 0.046774464189432 * (in[io + 1] + in[io + 9]);
					a += 0.0327877214361155 * (in[io + 2] + in[io + 8]);
					a += -0.151365345728131 * (in[io + 3] + in[io + 7]);
					a += 0.257518107400242 * (in[io + 4] + in[io + 6]);
					a += in[io + 5];
				} else {
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io] * -0.0636619772367581;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR23_0 extends FIRCompiled_RRR {
		public FIR23_0(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
				a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++]; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
				a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io] * -0.0234107370363856;

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR23_1 extends FIRCompiled_RRR {
		public FIR23_1(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 22 < in_length) {
					a += in[io++] * -0.0234107370363856;
					a += in[io++] * 2.72872028276356e-17;
					a += in[io++] * 0.0286131230444713;
					a += in[io++] * -0.0378413364320329;
					a += in[io++] * 0.0140518806154781;
					a += in[io++] * 0.0311829761262879;
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.257518107400242;
					a += in[io++];
					a += in[io++] * 0.257518107400242;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.0311829761262879;
					a += in[io++] * 0.0140518806154781;
					a += in[io++] * -0.0378413364320329;
					a += in[io++] * 0.0286131230444713;
					a += in[io++] * 2.72872028276356e-17;
					a += in[io] * -0.0234107370363856;
				} else {
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io] * -0.0234107370363856;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR23_2 extends FIRCompiled_RRR {
		public FIR23_2(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 22 < in_length) {
					a += -0.0234107370363856 * (in[io + 0] + in[io + 22]);
					a += 2.72872028276356e-17 * (in[io + 1] + in[io + 21]);
					a += 0.0286131230444713 * (in[io + 2] + in[io + 20]);
					a += -0.0378413364320329 * (in[io + 3] + in[io + 19]);
					a += 0.0140518806154781 * (in[io + 4] + in[io + 18]);
					a += 0.0311829761262879 * (in[io + 5] + in[io + 17]);
					a += -0.0636619772367581 * (in[io + 6] + in[io + 16]);
					a += 0.046774464189432 * (in[io + 7] + in[io + 15]);
					a += 0.0327877214361155 * (in[io + 8] + in[io + 14]);
					a += -0.151365345728131 * (in[io + 9] + in[io + 13]);
					a += 0.257518107400242 * (in[io + 10] + in[io + 12]);
					a += in[io + 11];
				} else {
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io] * -0.0234107370363856;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR57_0 extends FIRCompiled_RRR {
		public FIR57_0(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
				a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
				a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++]; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
				a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
				a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
				a += in[io] * -0.0108118104091523;

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR57_1 extends FIRCompiled_RRR {
		public FIR57_1(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 56 < in_length) {
					a += in[io++] * -0.0108118104091523;
					a += in[io++] * 0.0036430801595684;
					a += in[io++] * 0.0071960714137587;
					a += in[io++] * -0.0127323954473516;
					a += in[io++] * 0.00779574403157201;
					a += in[io++] * 0.0042766593177542;
					a += in[io++] * -0.0137604859752847;
					a += in[io++] * 0.0122627670190592;
					a += in[io++] * -2.72872028276356e-17;
					a += in[io++] * -0.0135535846000127;
					a += in[io++] * 0.0168183717475702;
					a += in[io++] * -0.00578606848872633;
					a += in[io++] * -0.011693616047358;
					a += in[io++] * 0.0212206590789194;
					a += in[io++] * -0.013364132625552;
					a += in[io++] * -0.00756639725448813;
					a += in[io++] * 0.0252275576213552;
					a += in[io++] * -0.0234107370363856;
					a += in[io++] * 2.72872028276356e-17;
					a += in[io++] * 0.0286131230444713;
					a += in[io++] * -0.0378413364320329;
					a += in[io++] * 0.0140518806154781;
					a += in[io++] * 0.0311829761262879;
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.257518107400242;
					a += in[io++];
					a += in[io++] * 0.257518107400242;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.0311829761262879;
					a += in[io++] * 0.0140518806154781;
					a += in[io++] * -0.0378413364320329;
					a += in[io++] * 0.0286131230444713;
					a += in[io++] * 2.72872028276356e-17;
					a += in[io++] * -0.0234107370363856;
					a += in[io++] * 0.0252275576213552;
					a += in[io++] * -0.00756639725448813;
					a += in[io++] * -0.013364132625552;
					a += in[io++] * 0.0212206590789194;
					a += in[io++] * -0.011693616047358;
					a += in[io++] * -0.00578606848872633;
					a += in[io++] * 0.0168183717475702;
					a += in[io++] * -0.0135535846000127;
					a += in[io++] * -2.72872028276356e-17;
					a += in[io++] * 0.0122627670190592;
					a += in[io++] * -0.0137604859752847;
					a += in[io++] * 0.0042766593177542;
					a += in[io++] * 0.00779574403157201;
					a += in[io++] * -0.0127323954473516;
					a += in[io++] * 0.0071960714137587;
					a += in[io++] * 0.0036430801595684;
					a += in[io] * -0.0108118104091523;
				} else {
					a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io] * -0.0108118104091523;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR57_2 extends FIRCompiled_RRR {
		public FIR57_2(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 56 < in_length) {
					a += -0.0108118104091523 * (in[io + 0] + in[io + 56]);
					a += 0.0036430801595684 * (in[io + 1] + in[io + 55]);
					a += 0.0071960714137587 * (in[io + 2] + in[io + 54]);
					a += -0.0127323954473516 * (in[io + 3] + in[io + 53]);
					a += 0.00779574403157201 * (in[io + 4] + in[io + 52]);
					a += 0.0042766593177542 * (in[io + 5] + in[io + 51]);
					a += -0.0137604859752847 * (in[io + 6] + in[io + 50]);
					a += 0.0122627670190592 * (in[io + 7] + in[io + 49]);
					a += -2.72872028276356e-17 * (in[io + 8] - in[io + 18] - in[io + 38] + in[io + 48]);
					a += -0.0135535846000127 * (in[io + 9] + in[io + 47]);
					a += 0.0168183717475702 * (in[io + 10] + in[io + 46]);
					a += -0.00578606848872633 * (in[io + 11] + in[io + 45]);
					a += -0.011693616047358 * (in[io + 12] + in[io + 44]);
					a += 0.0212206590789194 * (in[io + 13] + in[io + 43]);
					a += -0.013364132625552 * (in[io + 14] + in[io + 42]);
					a += -0.00756639725448813 * (in[io + 15] + in[io + 41]);
					a += 0.0252275576213552 * (in[io + 16] + in[io + 40]);
					a += -0.0234107370363856 * (in[io + 17] + in[io + 39]);
					a += 0.0286131230444713 * (in[io + 19] + in[io + 37]);
					a += -0.0378413364320329 * (in[io + 20] + in[io + 36]);
					a += 0.0140518806154781 * (in[io + 21] + in[io + 35]);
					a += 0.0311829761262879 * (in[io + 22] + in[io + 34]);
					a += -0.0636619772367581 * (in[io + 23] + in[io + 33]);
					a += 0.046774464189432 * (in[io + 24] + in[io + 32]);
					a += 0.0327877214361155 * (in[io + 25] + in[io + 31]);
					a += -0.151365345728131 * (in[io + 26] + in[io + 30]);
					a += 0.257518107400242 * (in[io + 27] + in[io + 29]);
					a += in[io + 28];
				} else {
					a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io] * -0.0108118104091523;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR115_0 extends FIRCompiled_RRR {
		public FIR115_0(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				a += in[io++] * -0.00172566954926927; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00334103315638797; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00578745247606892; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00346477512514311; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00185590876053485; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00582174406646657; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00504937465490674; if (io >= in_length) io -= in_length;
				a += in[io++] * 4.99044805624873e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00525547157959675; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00630688940533882; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00209283328315632; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00406734471212452; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00707355302630646; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00425222401722107; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00228751544903125; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00720787360610148; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00628092944878641; if (io >= in_length) io -= in_length;
				a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00660302839487799; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00796659714358586; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00265846390022557; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00519716268771459; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00909456817667973; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00550287813993322; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00298070194873773; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0094603341080082; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00830703572258846; if (io >= in_length) io -= in_length;
				a += in[io++] * -1.04082600637838e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00887993473793935; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
				a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
				a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++]; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
				a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
				a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00887993473793935; if (io >= in_length) io -= in_length;
				a += in[io++] * -1.04082600637838e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00830703572258846; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.0094603341080082; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00298070194873773; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00550287813993322; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00909456817667973; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00519716268771459; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00265846390022557; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00796659714358586; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00660302839487799; if (io >= in_length) io -= in_length;
				a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00628092944878641; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00720787360610148; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00228751544903125; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00425222401722107; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00707355302630646; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00406734471212452; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00209283328315632; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00630688940533882; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00525547157959675; if (io >= in_length) io -= in_length;
				a += in[io++] * 4.99044805624873e-17; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00504937465490674; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00582174406646657; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00185590876053485; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00346477512514311; if (io >= in_length) io -= in_length;
				a += in[io++] * 0.00578745247606892; if (io >= in_length) io -= in_length;
				a += in[io++] * -0.00334103315638797; if (io >= in_length) io -= in_length;
				a += in[io] * -0.00172566954926927;

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR115_1 extends FIRCompiled_RRR {
		public FIR115_1(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 114 < in_length) {
					a += in[io++] * -0.00172566954926927;
					a += in[io++] * -0.00334103315638797;
					a += in[io++] * 0.00578745247606892;
					a += in[io++] * -0.00346477512514311;
					a += in[io++] * -0.00185590876053485;
					a += in[io++] * 0.00582174406646657;
					a += in[io++] * -0.00504937465490674;
					a += in[io++] * 4.99044805624873e-17;
					a += in[io++] * 0.00525547157959675;
					a += in[io++] * -0.00630688940533882;
					a += in[io++] * 0.00209283328315632;
					a += in[io++] * 0.00406734471212452;
					a += in[io++] * -0.00707355302630646;
					a += in[io++] * 0.00425222401722107;
					a += in[io++] * 0.00228751544903125;
					a += in[io++] * -0.00720787360610148;
					a += in[io++] * 0.00628092944878641;
					a += in[io++] * -2.72872028276356e-17;
					a += in[io++] * -0.00660302839487799;
					a += in[io++] * 0.00796659714358586;
					a += in[io++] * -0.00265846390022557;
					a += in[io++] * -0.00519716268771459;
					a += in[io++] * 0.00909456817667973;
					a += in[io++] * -0.00550287813993322;
					a += in[io++] * -0.00298070194873773;
					a += in[io++] * 0.0094603341080082;
					a += in[io++] * -0.00830703572258846;
					a += in[io++] * -1.04082600637838e-17;
					a += in[io++] * 0.00887993473793935;
					a += in[io++] * -0.0108118104091523;
					a += in[io++] * 0.0036430801595684;
					a += in[io++] * 0.0071960714137587;
					a += in[io++] * -0.0127323954473516;
					a += in[io++] * 0.00779574403157201;
					a += in[io++] * 0.0042766593177542;
					a += in[io++] * -0.0137604859752847;
					a += in[io++] * 0.0122627670190592;
					a += in[io++] * -2.72872028276356e-17;
					a += in[io++] * -0.0135535846000127;
					a += in[io++] * 0.0168183717475702;
					a += in[io++] * -0.00578606848872633;
					a += in[io++] * -0.011693616047358;
					a += in[io++] * 0.0212206590789194;
					a += in[io++] * -0.013364132625552;
					a += in[io++] * -0.00756639725448813;
					a += in[io++] * 0.0252275576213552;
					a += in[io++] * -0.0234107370363856;
					a += in[io++] * 2.72872028276356e-17;
					a += in[io++] * 0.0286131230444713;
					a += in[io++] * -0.0378413364320329;
					a += in[io++] * 0.0140518806154781;
					a += in[io++] * 0.0311829761262879;
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.257518107400242;
					a += in[io++];
					a += in[io++] * 0.257518107400242;
					a += in[io++] * -0.151365345728131;
					a += in[io++] * 0.0327877214361155;
					a += in[io++] * 0.046774464189432;
					a += in[io++] * -0.0636619772367581;
					a += in[io++] * 0.0311829761262879;
					a += in[io++] * 0.0140518806154781;
					a += in[io++] * -0.0378413364320329;
					a += in[io++] * 0.0286131230444713;
					a += in[io++] * 2.72872028276356e-17;
					a += in[io++] * -0.0234107370363856;
					a += in[io++] * 0.0252275576213552;
					a += in[io++] * -0.00756639725448813;
					a += in[io++] * -0.013364132625552;
					a += in[io++] * 0.0212206590789194;
					a += in[io++] * -0.011693616047358;
					a += in[io++] * -0.00578606848872633;
					a += in[io++] * 0.0168183717475702;
					a += in[io++] * -0.0135535846000127;
					a += in[io++] * -2.72872028276356e-17;
					a += in[io++] * 0.0122627670190592;
					a += in[io++] * -0.0137604859752847;
					a += in[io++] * 0.0042766593177542;
					a += in[io++] * 0.00779574403157201;
					a += in[io++] * -0.0127323954473516;
					a += in[io++] * 0.0071960714137587;
					a += in[io++] * 0.0036430801595684;
					a += in[io++] * -0.0108118104091523;
					a += in[io++] * 0.00887993473793935;
					a += in[io++] * -1.04082600637838e-17;
					a += in[io++] * -0.00830703572258846;
					a += in[io++] * 0.0094603341080082;
					a += in[io++] * -0.00298070194873773;
					a += in[io++] * -0.00550287813993322;
					a += in[io++] * 0.00909456817667973;
					a += in[io++] * -0.00519716268771459;
					a += in[io++] * -0.00265846390022557;
					a += in[io++] * 0.00796659714358586;
					a += in[io++] * -0.00660302839487799;
					a += in[io++] * -2.72872028276356e-17;
					a += in[io++] * 0.00628092944878641;
					a += in[io++] * -0.00720787360610148;
					a += in[io++] * 0.00228751544903125;
					a += in[io++] * 0.00425222401722107;
					a += in[io++] * -0.00707355302630646;
					a += in[io++] * 0.00406734471212452;
					a += in[io++] * 0.00209283328315632;
					a += in[io++] * -0.00630688940533882;
					a += in[io++] * 0.00525547157959675;
					a += in[io++] * 4.99044805624873e-17;
					a += in[io++] * -0.00504937465490674;
					a += in[io++] * 0.00582174406646657;
					a += in[io++] * -0.00185590876053485;
					a += in[io++] * -0.00346477512514311;
					a += in[io++] * 0.00578745247606892;
					a += in[io++] * -0.00334103315638797;
					a += in[io] * -0.00172566954926927;
				} else {
					a += in[io++] * -0.00172566954926927; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00334103315638797; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00578745247606892; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00346477512514311; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00185590876053485; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00582174406646657; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00504937465490674; if (io >= in_length) io -= in_length;
					a += in[io++] * 4.99044805624873e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00525547157959675; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00630688940533882; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00209283328315632; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00406734471212452; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00707355302630646; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00425222401722107; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00228751544903125; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00720787360610148; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00628092944878641; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00660302839487799; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00796659714358586; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00265846390022557; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00519716268771459; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00909456817667973; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00550287813993322; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00298070194873773; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0094603341080082; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00830703572258846; if (io >= in_length) io -= in_length;
					a += in[io++] * -1.04082600637838e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00887993473793935; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00887993473793935; if (io >= in_length) io -= in_length;
					a += in[io++] * -1.04082600637838e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00830703572258846; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0094603341080082; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00298070194873773; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00550287813993322; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00909456817667973; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00519716268771459; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00265846390022557; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00796659714358586; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00660302839487799; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00628092944878641; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00720787360610148; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00228751544903125; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00425222401722107; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00707355302630646; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00406734471212452; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00209283328315632; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00630688940533882; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00525547157959675; if (io >= in_length) io -= in_length;
					a += in[io++] * 4.99044805624873e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00504937465490674; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00582174406646657; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00185590876053485; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00346477512514311; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00578745247606892; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00334103315638797; if (io >= in_length) io -= in_length;
					a += in[io] * -0.00172566954926927;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	private static class FIR115_2 extends FIRCompiled_RRR {
		public FIR115_2(double[] taps) { super(taps); }
		@Override
		public int apply(double[] out, int outOffset, int outSize, double[] in, int inOffset, int inSize) {
			if (inSize < size || outSize <= 0)
				return 0;
			int length = Math.min(inSize - size + 1, outSize);
			int in_length = in.length;
			if (inOffset >= in_length)
				inOffset %= in_length;
			int i = 0;
			do {
				double a = 0.0;

				int io = inOffset + i;
				if (io >= in_length)
					io -= in_length;

				if (io + 114 < in_length) {
					a += -0.00172566954926927 * (in[io + 0] + in[io + 114]);
					a += -0.00334103315638797 * (in[io + 1] + in[io + 113]);
					a += 0.00578745247606892 * (in[io + 2] + in[io + 112]);
					a += -0.00346477512514311 * (in[io + 3] + in[io + 111]);
					a += -0.00185590876053485 * (in[io + 4] + in[io + 110]);
					a += 0.00582174406646657 * (in[io + 5] + in[io + 109]);
					a += -0.00504937465490674 * (in[io + 6] + in[io + 108]);
					a += 4.99044805624873e-17 * (in[io + 7] + in[io + 107]);
					a += 0.00525547157959675 * (in[io + 8] + in[io + 106]);
					a += -0.00630688940533882 * (in[io + 9] + in[io + 105]);
					a += 0.00209283328315632 * (in[io + 10] + in[io + 104]);
					a += 0.00406734471212452 * (in[io + 11] + in[io + 103]);
					a += -0.00707355302630646 * (in[io + 12] + in[io + 102]);
					a += 0.00425222401722107 * (in[io + 13] + in[io + 101]);
					a += 0.00228751544903125 * (in[io + 14] + in[io + 100]);
					a += -0.00720787360610148 * (in[io + 15] + in[io + 99]);
					a += 0.00628092944878641 * (in[io + 16] + in[io + 98]);
					a += -2.72872028276356e-17 * (in[io + 17] + in[io + 37] - in[io + 47] - in[io + 67] + in[io + 77] + in[io + 97]);
					a += -0.00660302839487799 * (in[io + 18] + in[io + 96]);
					a += 0.00796659714358586 * (in[io + 19] + in[io + 95]);
					a += -0.00265846390022557 * (in[io + 20] + in[io + 94]);
					a += -0.00519716268771459 * (in[io + 21] + in[io + 93]);
					a += 0.00909456817667973 * (in[io + 22] + in[io + 92]);
					a += -0.00550287813993322 * (in[io + 23] + in[io + 91]);
					a += -0.00298070194873773 * (in[io + 24] + in[io + 90]);
					a += 0.0094603341080082 * (in[io + 25] + in[io + 89]);
					a += -0.00830703572258846 * (in[io + 26] + in[io + 88]);
					a += -1.04082600637838e-17 * (in[io + 27] + in[io + 87]);
					a += 0.00887993473793935 * (in[io + 28] + in[io + 86]);
					a += -0.0108118104091523 * (in[io + 29] + in[io + 85]);
					a += 0.0036430801595684 * (in[io + 30] + in[io + 84]);
					a += 0.0071960714137587 * (in[io + 31] + in[io + 83]);
					a += -0.0127323954473516 * (in[io + 32] + in[io + 82]);
					a += 0.00779574403157201 * (in[io + 33] + in[io + 81]);
					a += 0.0042766593177542 * (in[io + 34] + in[io + 80]);
					a += -0.0137604859752847 * (in[io + 35] + in[io + 79]);
					a += 0.0122627670190592 * (in[io + 36] + in[io + 78]);
					a += -0.0135535846000127 * (in[io + 38] + in[io + 76]);
					a += 0.0168183717475702 * (in[io + 39] + in[io + 75]);
					a += -0.00578606848872633 * (in[io + 40] + in[io + 74]);
					a += -0.011693616047358 * (in[io + 41] + in[io + 73]);
					a += 0.0212206590789194 * (in[io + 42] + in[io + 72]);
					a += -0.013364132625552 * (in[io + 43] + in[io + 71]);
					a += -0.00756639725448813 * (in[io + 44] + in[io + 70]);
					a += 0.0252275576213552 * (in[io + 45] + in[io + 69]);
					a += -0.0234107370363856 * (in[io + 46] + in[io + 68]);
					a += 0.0286131230444713 * (in[io + 48] + in[io + 66]);
					a += -0.0378413364320329 * (in[io + 49] + in[io + 65]);
					a += 0.0140518806154781 * (in[io + 50] + in[io + 64]);
					a += 0.0311829761262879 * (in[io + 51] + in[io + 63]);
					a += -0.0636619772367581 * (in[io + 52] + in[io + 62]);
					a += 0.046774464189432 * (in[io + 53] + in[io + 61]);
					a += 0.0327877214361155 * (in[io + 54] + in[io + 60]);
					a += -0.151365345728131 * (in[io + 55] + in[io + 59]);
					a += 0.257518107400242 * (in[io + 56] + in[io + 58]);
					a += in[io + 57];
				} else {
					a += in[io++] * -0.00172566954926927; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00334103315638797; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00578745247606892; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00346477512514311; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00185590876053485; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00582174406646657; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00504937465490674; if (io >= in_length) io -= in_length;
					a += in[io++] * 4.99044805624873e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00525547157959675; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00630688940533882; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00209283328315632; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00406734471212452; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00707355302630646; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00425222401722107; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00228751544903125; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00720787360610148; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00628092944878641; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00660302839487799; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00796659714358586; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00265846390022557; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00519716268771459; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00909456817667973; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00550287813993322; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00298070194873773; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0094603341080082; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00830703572258846; if (io >= in_length) io -= in_length;
					a += in[io++] * -1.04082600637838e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00887993473793935; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++]; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.257518107400242; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.151365345728131; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0327877214361155; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.046774464189432; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0636619772367581; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0311829761262879; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0140518806154781; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0378413364320329; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0286131230444713; if (io >= in_length) io -= in_length;
					a += in[io++] * 2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0234107370363856; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0252275576213552; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00756639725448813; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.013364132625552; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0212206590789194; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.011693616047358; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00578606848872633; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0168183717475702; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0135535846000127; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0122627670190592; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0137604859752847; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0042766593177542; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00779574403157201; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0127323954473516; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0071960714137587; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0036430801595684; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.0108118104091523; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00887993473793935; if (io >= in_length) io -= in_length;
					a += in[io++] * -1.04082600637838e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00830703572258846; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.0094603341080082; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00298070194873773; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00550287813993322; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00909456817667973; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00519716268771459; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00265846390022557; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00796659714358586; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00660302839487799; if (io >= in_length) io -= in_length;
					a += in[io++] * -2.72872028276356e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00628092944878641; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00720787360610148; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00228751544903125; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00425222401722107; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00707355302630646; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00406734471212452; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00209283328315632; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00630688940533882; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00525547157959675; if (io >= in_length) io -= in_length;
					a += in[io++] * 4.99044805624873e-17; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00504937465490674; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00582174406646657; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00185590876053485; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00346477512514311; if (io >= in_length) io -= in_length;
					a += in[io++] * 0.00578745247606892; if (io >= in_length) io -= in_length;
					a += in[io++] * -0.00334103315638797; if (io >= in_length) io -= in_length;
					a += in[io] * -0.00172566954926927;
				}

				out[outOffset++] = a;
			} while (++i < length);
			return length;
		}
	}

	FIR java005_0;
	FIR java011_0;
	FIR java023_0;
	FIR java057_0;
	FIR java115_0;
	FIR java005_1;
	FIR java011_1;
	FIR java023_1;
	FIR java057_1;
	FIR java115_1;
	FIR java005_2;
	FIR java011_2;
	FIR java023_2;
	FIR java057_2;
	FIR java115_2;

	double[] getSinc(int l) {
		double sinc[] = new double[l];
		int M = (l - 1) / 2;
		double fwT0 = 2 * Math.PI * 0.35;
		for (int n = -M; n <= M; n++) {
			if (n == 0)
				sinc[n + M] = 1.0;
			else
				sinc[n + M] = Math.sin(n * fwT0) / (n * Math.PI);
		}
		return sinc;
	}

	@Setup(Level.Trial)
	public void setup() {
		for (int i = 0; i < data.length; i++)
			data[i] = Math.random() * 2 - 1;

		java005_0 = new FIR5_0(getSinc(5));
		java011_0 = new FIR11_0(getSinc(11));
		java023_0 = new FIR23_0(getSinc(23));
		java057_0 = new FIR57_0(getSinc(57));
		java115_0 = new FIR115_0(getSinc(115));

		java005_1 = new FIR5_1(getSinc(5));
		java011_1 = new FIR11_1(getSinc(11));
		java023_1 = new FIR23_1(getSinc(23));
		java057_1 = new FIR57_1(getSinc(57));
		java115_1 = new FIR115_1(getSinc(115));

		java005_2 = new FIR5_2(getSinc(5));
		java011_2 = new FIR11_2(getSinc(11));
		java023_2 = new FIR23_2(getSinc(23));
		java057_2 = new FIR57_2(getSinc(57));
		java115_2 = new FIR115_2(getSinc(115));
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _005_no_wrap_o0_gr() {
		java005_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _005_no_wrap_o0_hs() {
		java005_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _011_no_wrap_o0_gr() {
		java011_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _011_no_wrap_o0_hs() {
		java011_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _023_no_wrap_o0_gr() {
		java023_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _023_no_wrap_o0_hs() {
		java023_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _057_no_wrap_o0_gr() {
		java057_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _057_no_wrap_o0_hs() {
		java057_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _115_no_wrap_o0_gr() {
		java115_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _115_no_wrap_o0_hs() {
		java115_0.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _005_no_wrap_o1_gr() {
		java005_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _005_no_wrap_o1_hs() {
		java005_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _011_no_wrap_o1_gr() {
		java011_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _011_no_wrap_o1_hs() {
		java011_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _023_no_wrap_o1_gr() {
		java023_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _023_no_wrap_o1_hs() {
		java023_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _057_no_wrap_o1_gr() {
		java057_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _057_no_wrap_o1_hs() {
		java057_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _115_no_wrap_o1_gr() {
		java115_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _115_no_wrap_o1_hs() {
		java115_1.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _005_no_wrap_o2_gr() {
		java005_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _005_no_wrap_o2_hs() {
		java005_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _011_no_wrap_o2_gr() {
		java011_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _011_no_wrap_o2_hs() {
		java011_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _023_no_wrap_o2_gr() {
		java023_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _023_no_wrap_o2_hs() {
		java023_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _057_no_wrap_o2_gr() {
		java057_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _057_no_wrap_o2_hs() {
		java057_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _115_no_wrap_o2_gr() {
		java115_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _115_no_wrap_o2_hs() {
		java115_2.apply(out, 0, out.length, data, 0, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _005_wrap_o0_gr() {
		java005_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _005_wrap_o0_hs() {
		java005_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _011_wrap_o0_gr() {
		java011_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _011_wrap_o0_hs() {
		java011_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _023_wrap_o0_gr() {
		java023_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _023_wrap_o0_hs() {
		java023_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _057_wrap_o0_gr() {
		java057_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _057_wrap_o0_hs() {
		java057_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _115_wrap_o0_gr() {
		java115_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _115_wrap_o0_hs() {
		java115_0.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _005_wrap_o1_gr() {
		java005_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _005_wrap_o1_hs() {
		java005_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _011_wrap_o1_gr() {
		java011_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _011_wrap_o1_hs() {
		java011_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _023_wrap_o1_gr() {
		java023_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _023_wrap_o1_hs() {
		java023_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _057_wrap_o1_gr() {
		java057_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _057_wrap_o1_hs() {
		java057_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _115_wrap_o1_gr() {
		java115_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _115_wrap_o1_hs() {
		java115_1.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _005_wrap_o2_gr() {
		java005_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _005_wrap_o2_hs() {
		java005_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _011_wrap_o2_gr() {
		java011_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _011_wrap_o2_hs() {
		java011_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _023_wrap_o2_gr() {
		java023_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _023_wrap_o2_hs() {
		java023_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _057_wrap_o2_gr() {
		java057_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _057_wrap_o2_hs() {
		java057_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:+UseJVMCICompiler")
	public void _115_wrap_o2_gr() {
		java115_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}

	@Benchmark
	@Fork(jvmArgsAppend = "-XX:-UseJVMCICompiler")
	public void _115_wrap_o2_hs() {
		java115_2.apply(out, 0, out.length, data, data.length / 2, data.length);
	}
}
