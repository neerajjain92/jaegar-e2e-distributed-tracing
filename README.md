# jaegar-e2e-distributed-tracing
Working example of Jaegar End to End Distributed Tracing in Distributed Systems


# Run Jaegar container via docker.

```
docker run -d --name jaegar-ui -p 16686:16686 -p 6831:6831/udp jaegertracing/all-in-one
```