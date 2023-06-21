import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_api-performance-testing-with-katalon-and-jmeter'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/api-performance-testing-with-katalon-and-jmeter/19052')

'step 2: Add visual checkpoint at Page_t_api-performance-testing-with-katalon-and-jmeter'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00015_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
