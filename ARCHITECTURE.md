# Architecture

## High-Level Design
- **shared/**: Single source of truth for domain models, DTOs, API contracts, business logic, and shared networking.
- **server/**: Backend monolith (Ktor initially).
- **androidApp/**, **desktopApp/**, etc.: Platform-specific entry points with minimal code.

## Key Principles
- Contract-First development
- Maximum code sharing
- Monolith-first approach
- Clean Architecture in shared module

## Decision Registry (DR)
- DR-001: KMP 2026 structure
- DR-002: shared contract-only
- DR-003: Monolith-first

Update this document with every major decision.