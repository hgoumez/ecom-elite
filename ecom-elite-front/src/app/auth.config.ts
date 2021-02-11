import { AuthConfig } from 'angular-oauth2-oidc';

export const authCodeFlowConfig: AuthConfig = {
  issuer: 'http://10.0.75.1:8074/auth/realms/ecom',
  redirectUri: window.location.origin,
  clientId: 'ecom-client',
  responseType: 'code',
  showDebugInformation: true,
  requireHttps: false
};
