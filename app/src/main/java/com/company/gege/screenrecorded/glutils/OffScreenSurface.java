package com.company.gege.screenrecorded.glutils;

/**
 * Create offscreen using EglSurface. 
 */ 
public class OffScreenSurface extends EglSurfaceBase { 
 
 public OffScreenSurface(final EglCore eglBase, final int width, final int height) { 
  super(eglBase); 
  createOffscreenSurface(width, height); 
  makeCurrent(); 
 } 
 
 public void release() { 
  releaseEglSurface(); 
 } 
 
}