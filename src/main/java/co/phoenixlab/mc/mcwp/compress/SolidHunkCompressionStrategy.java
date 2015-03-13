package co.phoenixlab.mc.mcwp.compress;

public class SolidHunkCompressionStrategy implements HunkCompressionStrategy {
    @Override
    public int estimateCompressedSize(int[] data) {
        return 0;
    }

    @Override
    public byte[] compress(int[] data) {
        return new byte[0];
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int[] decompress(byte[] compressedData) {
        return new int[0];
    }
}
