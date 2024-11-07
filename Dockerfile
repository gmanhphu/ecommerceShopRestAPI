FROM ubuntu:latest
LABEL authors="gmanh"

ENTRYPOINT ["top", "-b"]