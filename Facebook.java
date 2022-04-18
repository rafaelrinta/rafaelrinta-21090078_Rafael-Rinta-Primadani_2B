public class Facebook {
    public String Nama;
    public String Media;
    public int JumlahLike;
    public int JumlahComment;
    public String DirectMessage;

    public Facebook(String namaakn, String mda, int jlike, int jcomment, String dm) {
        this.Nama = namaakn;
        this.Media = mda;
        this.JumlahLike = jlike;
        this.JumlahComment = jcomment;
        this.DirectMessage = dm;
    }
    public String getNama(){
    return this.Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getMedia(){
    return this.Media;
    }
    public void setMedia(String Media){
        this.Media = Media;
    }
    public int getJumlahLike(){
    return this.JumlahLike;
    }
    public void setJumlahLike(int JumlahLike){
        this.JumlahLike = JumlahLike;
    }
    public int getJumlahComment(){
    return this.JumlahComment;
    }
    public void setJumlahComment(int JumlahComment){
        this.JumlahComment = JumlahComment;
    }
}
