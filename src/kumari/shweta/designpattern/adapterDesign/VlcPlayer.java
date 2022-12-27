package kumari.shweta.designpattern.adapterDesign;

 class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
	System.out.println("Play vlc file "+filename);
		
	}

	@Override
	public void playMp4(String filename) {
		// Do nothing
		
	}

}
