# Java wrapper for common video encoding format

This library enables the use of common video encoding formats used at IHMC in Java. Native code is bridged using SWIG.

## Philosophy

All code is released under a permissive Apache 2.0 license. This library tries to avoid problems with licensing patents, for example trough the use of the OpenH264 module.

Simple, well defined classes to support the functionality needed are written in C++. SWIG is used to bridge our C++ classes to Java. Only basic features are supported, keeping the API simple and maintainable.

Only video is supported.

## Features

- Video tracks only
- Supports RGB <-> YUV conversion using libyuv (BSD license)
- Supports JPEG encoding/decoding using libjpeg-turbo (BSD/IJG license)
- Bridge to OpenH264 (BSD License)
	- Automatic downloading of Cisco licensed binary
- MP4 support based on JCodec (BSD License)
	- Mux: H264, MJPEG
	- Demux: H264, MJPEG 
- Fast screenshot support using native code
	- Linux only
	- Fallback using AWT Robot for Mac/Windows


## Usage
See the examples directory

## Headless systems
To accept the license on a system without console input, add "-Dopenh264.license=accept" to your Java command line arguments.

## Contributions
Contributions are welcome. We are a robot lab, supporting video codecs is not our main focus. Please provide pull requests. If you or your organization is interested in taking over maintainance, please contact us. 

## Compile native code

For your convenience compiled libraries are placed in the resources directory. It's only necessary to compile native code if you want to change native code or port to different platforms.

### Linux
- Install OpenJDK (>6)
- Compile LibYUV following https://code.google.com/p/libyuv/wiki/GettingStarted
	- When ninja complains about tools/sanitizer_options/sanitizer_options.cc get it from the chromium git: https://chromium.googlesource.com/chromium/src/base/+/f64188fb60c527d54bb54f1d107a5b5890a49c89/debug/sanitizer_options.cc
- Download and compile the openH264 sources (version 1.3) from https://github.com/cisco/openh264
	- git clone https://github.com/cisco/openh264.git
	- cd openh264
	- git checkout openh264v1.3
	- make
- Install swig 3.0.3 or higher 
- Go to IHMCVideoCodecs directory
	- mkdir build
	- cd build
	- ccmake ..
		- Set LIBYUV_HOME to the libyuv trunk directory
		- Set OPENH264_HOME to the openh264 source directory
	- make
	- make install

### Mac
- Install the JDK for Mac (>6)
- Install homebrew
	- brew install nasm automake pcre cmake
- Add /usr/local/bin to the start of your path (for nasm)
- Install swig 3.0.3 from homebrew
- Download and compile the openH264 sources (version 1.3) from https://github.com/cisco/openh264
	- git clone https://github.com/cisco/openh264.git
	- git checkout openh264v1.3
	- cd openh264
	- make
- Compile LibYUV following https://code.google.com/p/libyuv/wiki/GettingStarted
	- mkdir libyuv
	- cd libyuv
	- git clone https://chromium.googlesource.com/chromium/tools/depot_tools.git
	- export PATH=`pwd`/depot_tools:"$PATH"
	- GYP_DEFINES="clang=1 target_arch=x64" ./gyp_libyuv -fninja --depth=. libyuv_test.gyp
	- ninja -j7 -C out/Release

- Go to IHMCVideoCodecs directory
	- mkdir build
	- cd build
	- ccmake ..
		- Set LIBYUV_HOME to the libyuv trunk directory
		- Set OPENH264_HOMe to the openh264 source directory
	- make
	- make install


### Windows

May the force be with you.

- Install Visual Studio Express 2013 for Windows Desktop
	- Continue while this is downloading and get some coffee
- Install the 64 bit JDK for Windows (>6)
- Install CMake using the installer http://www.cmake.org/download/
- Download and unpack swigwin 3.0.3
	- http://sourceforge.net/projects/swig/files/swigwin/swigwin-3.0.3/
- Install Libyuv
	- Follow instructions on https://code.google.com/p/libyuv/wiki/GettingStarted
		- Do not use cygwin
		- Dowloading the windows sdk takes forever, just have patience
- Install MinGW (you only need to select msys-base)
	- Use mingw-get-setup.exe from http://sourceforge.net/projects/mingw/files/Installer/
	- Setup %PATH to point to MinGW and MSYS
- Download the openh264 sources, tag v1.3
	- Use git
		- git clone https://github.com/cisco/openh264.git
		- git checkout openh264v1.3
	- Read the instructions in the openh264 README.md
	- Start the VS2013 x64 Cross Tools Command Prompt (Start -> Visual Studio 2013 -> Visual Studio Tools)
	- cd to the openh264 dir 
	- make OS=msvc ENABLE64BIT=Yes
- Start the cmake-gui
	- Point source directory to IHMCVideoCodecs sources
	- Point build directory to [sources]/build
	- Configure
		- Choose the Visual Studio 12 2013 Win64 generator
		- Choose native toolchain
		- Set all paths (LIBYUV_HOME, OPENH264_HOME, SWIG_EXECUTABLE) correctly
		- Configure
	- Generate
- Go to IHMCVideoCodecs/build
	- Double click on ALL_BUILD.vcxproj
	- Wait for VS2013 to start
	- Select "Release" build type
	- Right click ALL_BUILD and select build
	- Right click INSTALL and select build

## Publishing

To publish to Nexus, add the following lines to ~/.gradle/gradle.properties

nexus_username=[username]
nexus_password=[password]


Replace [username] and [password] with your nexus credentials

Then execute 

gradle publish
