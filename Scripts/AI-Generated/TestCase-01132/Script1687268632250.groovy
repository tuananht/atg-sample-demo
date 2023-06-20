import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-error-while-running-the-katalon-test-from-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-error-while-running-the-katalon-test-from-console/61222/3')

'step 2: Add visual checkpoint at Page_t_getting-error-while-running-the-katalon-test-from-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01132_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
