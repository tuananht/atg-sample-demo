import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_have-you-joined-our-onboarding-game-yet'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/have-you-joined-our-onboarding-game-yet/89555')

'step 2: Add visual checkpoint at Page_t_have-you-joined-our-onboarding-game-yet'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00238_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
