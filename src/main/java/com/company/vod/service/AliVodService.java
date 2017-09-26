package com.company.vod.service;

import com.company.vod.domain.AliVodPlayInfo;
import com.company.vod.domain.AliVodUploadInfo;
import com.xinwei.nnl.common.domain.ProcessResult;


public interface AliVodService {
	/**
	 * 阿里云视频服务上传请求
	 * @param aliyunVodinfo
	 * @return
	 */
	public  int  createUploadVideo(AliVodUploadInfo aliyunVodinfo);
	
	/**
	 * 阿里云视频服务更新上传请求
	 * @param aliyunVodinfo
	 * @return
	 */
	public  int  refreshUploadVideo(AliVodUploadInfo aliyunVodinfo);
	
	/**
	 * 请求播放视频
	 * @param aliVodPlayInfo
	 * @return
	 */
	public ProcessResult   requestPlayVideo(AliVodPlayInfo aliVodPlayInfo);

}
