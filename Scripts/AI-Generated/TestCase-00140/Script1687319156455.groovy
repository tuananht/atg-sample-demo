import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_your-connection-is-not-private-message-when-using-chrome-to-run-test-cases-katalon-7-2-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/your-connection-is-not-private-message-when-using-chrome-to-run-test-cases-katalon-7-2-1/41054/7')

'step 2: Add visual checkpoint at Page_t_your-connection-is-not-private-message-when-using-chrome-to-run-test-cases-katalon-7-2-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00140_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
