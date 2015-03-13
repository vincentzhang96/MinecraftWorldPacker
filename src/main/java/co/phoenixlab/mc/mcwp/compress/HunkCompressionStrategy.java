package co.phoenixlab.mc.mcwp.compress;

public interface HunkCompressionStrategy {

    /**
     * Estimates the amount of space the compressed version would take up. This is used to determine which
     * strategy to use for a given hunk. Implementations should return 0 if it is unable/unsuitable for
     * compressing the given hunk.
     * @param data An array of block IDs to compress, in YZX scan order; MUST be 4096 (16x16x16)
     *                  elements long.
     * @return The estimated compressed size, or 0 if the implementation cannot compress the given hunk.
     */
    int estimateCompressedSize(int[] data);

    byte[] compress(int[] data);

    String getName();

    int[] decompress(byte[] compressedData);
}
