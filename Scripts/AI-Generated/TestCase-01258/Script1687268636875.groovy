import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_api-test-against-web-service-running-in-aks-fails-with-connection-refused-and-lots-of-could-not-resolve-module-errors-in-the-katalon-log-when-executed-from-github-actions-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/api-test-against-web-service-running-in-aks-fails-with-connection-refused-and-lots-of-could-not-resolve-module-errors-in-the-katalon-log-when-executed-from-github-actions-workflow/63622/3')

'step 2: Add visual checkpoint at Page_t_api-test-against-web-service-running-in-aks-fails-with-connection-refused-and-lots-of-could-not-resolve-module-errors-in-the-katalon-log-when-executed-from-github-actions-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01258_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
