package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AudioInfo;
import com.huaweicloud.sdk.mpc.v1.model.VideoInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OriginPara
 */
public class OriginPara  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Long duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_format")
    
    private String fileFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video")
    
    private VideoInfo video = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private AudioInfo audio = null;

    public OriginPara withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 片源时长 
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public OriginPara withFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    


    /**
     * 文件格式 
     * @return fileFormat
     */
    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public OriginPara withVideo(VideoInfo video) {
        this.video = video;
        return this;
    }

    public OriginPara withVideo(Consumer<VideoInfo> videoSetter) {
        if(this.video == null ){
            this.video = new VideoInfo();
            videoSetter.accept(this.video);
        }
        
        return this;
    }


    /**
     * Get video
     * @return video
     */
    public VideoInfo getVideo() {
        return video;
    }

    public void setVideo(VideoInfo video) {
        this.video = video;
    }

    public OriginPara withAudio(AudioInfo audio) {
        this.audio = audio;
        return this;
    }

    public OriginPara withAudio(Consumer<AudioInfo> audioSetter) {
        if(this.audio == null ){
            this.audio = new AudioInfo();
            audioSetter.accept(this.audio);
        }
        
        return this;
    }


    /**
     * Get audio
     * @return audio
     */
    public AudioInfo getAudio() {
        return audio;
    }

    public void setAudio(AudioInfo audio) {
        this.audio = audio;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OriginPara originPara = (OriginPara) o;
        return Objects.equals(this.duration, originPara.duration) &&
            Objects.equals(this.fileFormat, originPara.fileFormat) &&
            Objects.equals(this.video, originPara.video) &&
            Objects.equals(this.audio, originPara.audio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(duration, fileFormat, video, audio);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginPara {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

