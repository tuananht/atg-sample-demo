import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_copy-duplicate-test-cases-into-another-katalon-project'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/copy-duplicate-test-cases-into-another-katalon-project/12282')

'step 2: Add visual checkpoint at Page_t_copy-duplicate-test-cases-into-another-katalon-project'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00597_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
