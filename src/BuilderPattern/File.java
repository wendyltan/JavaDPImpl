package BuilderPattern;

/**
 * The builder pattern concentrate on offering a well-encapsulation object to outside world.
 * Offer the necessary attributes through constructor and offer selectable attributes through
 * builder methods.Flexibily offer a well-sealed object with multiple attributes.Use this pattern
 * if you need an object with many attribute but sometimes not every attribute in it is necessary to set.
 */
public class File {
    private final String fileName;
    private final long fileSize;
    private final String filePath;

    private final String fileType;
    private final String fileLastEdit;
    private final String fileHash;

    public File(
        final String fileName,
        final long fileSize,
        final String filePath,
        final String fileType,
        final String fileLastEdit,
        final String fileHash
    ){
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
        this.fileType = fileType;
        this.fileLastEdit = fileLastEdit;
        this.fileHash = fileHash;
    }

    public String getAllInfo(){
        return fileName+" "+fileSize+" "+filePath+" -->"+fileType+" "+fileLastEdit+" "+fileHash;
    }

    public static class Builder{
        private String bfileName;
        private long bfileSize;
        private String bfilePath;

        private String bfileType;
        private String bfileLastEdit;
        private String bfileHash;

        public Builder(
            final String fileName,
            final long fileSize,
            final String filePath
        )
        {
            this.bfileName = fileName;
            this.bfileSize = fileSize;
            this.bfilePath = filePath;
        }

        public Builder fileType(final String fileType){
            this.bfileType = fileType;
            return this;
        }

        public Builder fileEdit(final String fileEdit){
            this.bfileLastEdit = fileEdit;
            return this;
        }
        public Builder fileHash(final String fileHash){
            this.bfileHash = fileHash;
            return this;
        }

        public File build(){
            return new File(bfileName,bfileSize,bfilePath,bfileType,bfileLastEdit,bfileHash);
        }


    }

}
