# Changelog
This file contains all the notable changes done to the Ballerina WebSocket package through the releases.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

- [Support Custom Remote Function Mapping via Annotation](https://github.com/ballerina-platform/ballerina-library/issues/7733)
- [Introduce Service Config Annotation for connectionClosureTimeout in Websocket module](https://github.com/ballerina-platform/ballerina-library/issues/7697)
- [Implement websocket close frame support](https://github.com/ballerina-platform/ballerina-library/issues/7578)

### Fixed

- [Fix WebSocket service delays handling of new remote calls until streaming response completes](https://github.com/ballerina-platform/ballerina-library/issues/7844)
- [Fix JSON response parsing issue with escaped double quotes](https://github.com/ballerina-platform/ballerina-library/issues/7720)

### Changed

- [Move SSL context creation to the client initialization](https://github.com/ballerina-platform/ballerina-library/issues/1798)

## [2.13.1] - 2025-02-11

### Fixed

- [Address Netty security vulnerabilities: `CVE-2025-24970` and `CVE-2025-25193`](https://github.com/ballerina-platform/ballerina-library/issues/7571)

## [2.13.0] - 2025-02-07

### Fixed

- [Address CVE-2024-47535 vulnerability](https://github.com/ballerina-platform/ballerina-library/issues/7358)

## [2.12.0] - 2024-08-20

### Added
- [Implement custom error remote functions for onXXXError](https://github.com/ballerina-platform/ballerina-library/issues/6625)
- [Introduce dispatcherStreamId annotation](https://github.com/ballerina-platform/ballerina-library/issues/6757)

## [2.10.0] - 2023-09-15

### Fixed
- [Fix Compilation Error for Stream Type With "Error" Substring in Signature](https://github.com/ballerina-platform/ballerina-standard-library/issues/4518)

## [2.9.0] - 2023-06-30

### Fixed
- [Address CVE-2023-34462 netty Vulnerability](https://github.com/ballerina-platform/ballerina-standard-library/issues/4599)

## [2.8.0] - 2023-06-01

### Fixed
- [Dispatch `onError` remote function when there is a data binding failure](https://github.com/ballerina-platform/ballerina-standard-library/issues/4403)

## [2.7.1] - 2023-04-25

### Fixed
- [Fix dispatching failure when a `-` is used in the service path](https://github.com/ballerina-platform/ballerina-standard-library/issues/4320)
- [Fix the hanging issue when closing the connection while reading the message](https://github.com/ballerina-platform/ballerina-standard-library/issues/3962)
- [Fix the dispatching issue when custom dispatching has `onMessage`](https://github.com/ballerina-platform/ballerina-standard-library/issues/4355)


## [2.6.0] - 2023-02-27

### Added
- [Implement dispatching to custom remote functions](https://github.com/ballerina-platform/ballerina-standard-library/issues/3670)

### Fixed
- [Fix data binding failure when a union type is used](https://github.com/ballerina-platform/ballerina-standard-library/issues/3909)
- [Fix data binding failure when a enum type is used](https://github.com/ballerina-platform/ballerina-standard-library/issues/3707)
- [Fix hanging issue of readMessage when it is called after connection closure](https://github.com/ballerina-platform/ballerina-standard-library/issues/3962)

## [2.5.0] - 2022-11-29

### Added
- [Support returning streams from WebSocket services](https://github.com/ballerina-platform/ballerina-standard-library/issues/2909)

### Changed
- [API Docs Updated](https://github.com/ballerina-platform/ballerina-standard-library/issues/3463)

### Fixed
- [Fix client returning irrelevant error message when given an ip address as the url](https://github.com/ballerina-platform/ballerina-standard-library/issues/3534)

## [2.4.0] - 2022-09-08

### Added
- [Incorporate constraint validation](https://github.com/ballerina-platform/ballerina-standard-library/issues/3058)

### Fixed
- [Fix server sending 500 status code when the client invokes it with an incorrect URL](https://github.com/ballerina-platform/ballerina-standard-library/issues/3296)

## [2201.1.1] - 2022-06-30

### Added
- [Add data binding support for WebSocket](https://github.com/ballerina-platform/ballerina-standard-library/issues/2761)

### Fixed
- [Fix the client connection closure issue](https://github.com/ballerina-platform/ballerina-standard-library/issues/2836)

## [2.2.1] - 2022-03-02

### Changed
- [Mark Websocket Service type as distinct](https://github.com/ballerina-platform/ballerina-standard-library/issues/2398)

### Added
- [Introduce readMessage Client API](https://github.com/ballerina-platform/ballerina-standard-library/issues/1180)

## [1.2.0-beta.3] - 2021-10-10

### Added
- [Introduce write time out for WebSocket client](https://github.com/ballerina-platform/ballerina-standard-library/issues/1609)
- [Add OAuth2 JWT bearer grant type support](https://github.com/ballerina-platform/ballerina-standard-library/issues/1788)
- [Implement retry for WebSocket client](https://github.com/ballerina-platform/ballerina-standard-library/issues/1715)
- [Improve the 'get' resource to include header and query param values](https://github.com/ballerina-platform/ballerina-standard-library/issues/1737)
- [Add resource code snippet generation code action for tooling](https://github.com/ballerina-platform/ballerina-standard-library/issues/1896)

## [1.2.0-beta.2] - 2021-07-07

### Added
- [Implement declarative auth design for upgrade service](https://github.com/ballerina-platform/ballerina-standard-library/issues/1405)
- [Make WebSocket caller isolated](https://github.com/ballerina-platform/ballerina-standard-library/issues/1589)

### Fixed
- [Remove the countdown latches in the implementation](https://github.com/ballerina-platform/ballerina-standard-library/issues/1385)
- [Fix the issue of not sending the handshake cancel response when panicked from the upgrade service](https://github.com/ballerina-platform/ballerina-standard-library/issues/1439)
- [Fix the client handshake timeout not working](https://github.com/ballerina-platform/ballerina-standard-library/issues/1478)

## [1.2.0-beta.1] - 2021-05-06

### Fixed
- [Fix the listener initialization with inline configs compiler plugin error](https://github.com/ballerina-platform/ballerina-standard-library/issues/1304)
- [Fix the dispatching to remote functions issue when observability is enabled](https://github.com/ballerina-platform/ballerina-standard-library/issues/1313)

## [1.2.0-alpha8] - 2021-04-22

### Added
- [Add compiler plugin validation for WebSocket](https://github.com/ballerina-platform/ballerina-standard-library/issues/778)

### Fixed
- [Improve error message when creating the WebSocket client with an invalid URL](https://github.com/ballerina-platform/ballerina-standard-library/issues/1142)

## [1.2.0-alpha5] - 2021-03-19

### Added
- [Introduce auth support for the WebSocket client](https://github.com/ballerina-platform/ballerina-standard-library/issues/820)
- [Introduce HTTP cookie support for the WebSocket client](https://github.com/ballerina-platform/ballerina-standard-library/issues/978)
- [Introduce support to send text, binary, and pong messages by returning them from the remote methods](https://github.com/ballerina-platform/ballerina-standard-library/issues/1033)

### Changed
- [Make the websocket:Caller optional in WebSocket service remote functions](https://github.com/ballerina-platform/ballerina-standard-library/issues/1033)
- [Update SecureSocket API](https://github.com/ballerina-platform/ballerina-standard-library/issues/1068)
- [Convert all the timeout configurations to decimal](https://github.com/ballerina-platform/ballerina-standard-library/issues/1024)

### Removed
- Remove the support for the `websocket:AsyncClient`
