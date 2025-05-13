interface Evenlistener{
	public void performevent();

}
class Mouselistener extends Evenlistener{
	public void mouseClicked();
	public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();

}
class Keylistener extends Evenlistener{
	public void keyPressed();
	public void keyReleased();
}
