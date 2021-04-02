package model

class Camera{ //clases para datos

    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var microfono: Boolean = false
    private var frontalCamera: Boolean = true


    fun setMicrofono(microfono: Boolean){
        this.microfono = microfono
    }

    fun getMicrofono(): Boolean{
        return this.microfono
    }

    fun setFrontalCamera(frontalCamera: Boolean){
        this.frontalCamera = frontalCamera
    }

    fun getFrontalCamera(): Boolean{
        return this.frontalCamera
    }

    fun getCameraUse(): String{
        return if (frontalCamera) "Si esta usando la camara frontal" else "Esta usando la camara de atras"
    }

    fun  setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }



    fun turnOn(){
        isOn = true

    }

    fun turnOf(){
        isOn = false

    }
    fun getCameraStatus(): String{
       return if (isOn) "camare is Turned" else "Camera is not Turnet"
    }

    /*fun setCameraStatus(onOff: Boolean){
        isOn = onOff
    }*/
}