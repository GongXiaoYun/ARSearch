package com.gxy.recycler;


interface BaseRefreshHeader {

	int STATE_NORMAL = 0;
	int STATE_RELEASE_TO_REFRESH = 1;
	int STATE_REFRESHING = 2;
	int STATE_DONE = 3;
	int STATE_REFRESHNONET = 4;

	void onMove(float delta);

	boolean releaseAction();

	void refreshComplete();

}