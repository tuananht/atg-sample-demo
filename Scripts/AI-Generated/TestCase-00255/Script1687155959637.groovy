import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-a-way-to-skip-test-cases-based-on-a-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-a-way-to-skip-test-cases-based-on-a-condition/27915/3')

'step 2: Add visual checkpoint at Page_t_is-there-a-way-to-skip-test-cases-based-on-a-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00255_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
