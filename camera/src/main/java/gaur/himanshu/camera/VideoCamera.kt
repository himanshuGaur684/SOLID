package gaur.himanshu.camera

open class VideoCamera(
    private val flashControl: FlashControl
) : VideoCapture {

    override fun captureVideo() {

    }

}


class HighResVideo(
    private val flashControl: FlashControl
) : VideoCamera(flashControl){
    override fun captureVideo() {
        super.captureVideo()
    }
}
