import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-object-with-id-object-repository-does-not-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-object-with-id-object-repository-does-not-exist/17330/2')

'step 2: Add visual checkpoint at Page_t_test-object-with-id-object-repository-does-not-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00429_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
